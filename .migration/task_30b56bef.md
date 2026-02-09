# Migration Task: Reemplazar imports javax.* por jakarta.* (migración Jakarta namespaces)

**Task ID:** 30b56bef
**Type:** breaking_change
**Status:** Completed
**Timestamp:** 2026-02-09T11:20:20.779967

## Description

Sustituir todas las referencias a javax.* (servlet, persistence, validation, etc.) por los paquetes jakarta.* requeridos por Spring Boot 3.x/Spring 6. Aplicar transformaciones automáticas donde sea seguro y anotar los cambios que requieran revisión manual.

## Acceptance Criteria

- [x] No quedan imports 'javax.' en los sources de producción (module/src/main/java)
- [x] El proyecto compila y los artefactos se generan después del cambio
- [x] Lista de cambios manuales documentada para los puntos no automáticos (p. ej. migración de libs que aún no soportan jakarta)

## Steps Executed

1. Crear branch para cambios breaking
2. Identificar todos los usos de APIs afectadas
3. Aplicar recipes de OpenRewrite
4. Revisar cambios generados
5. Corregir casos no cubiertos por recipes
6. Ejecutar tests completos
7. Documentar cambios breaking
8. Verificar criterios de aceptación: No quedan imports 'javax.' en los sources de producción (module/src/main/java), El proyecto compila y los artefactos se generan después del cambio
9. Commit y push

## OpenRewrite Recipes

- `org.openrewrite.java.migrate.JakartaXToJakartaEE`
- `org.openrewrite.java.migrate.MigrateJavaxServletToJakarta`

## Manual Steps Required

- Revisar cambios generados antes de commit
- Verificar que no hay regresiones funcionales
- Documentar cambios breaking para el equipo
- Actualizar CHANGELOG si existe

## Warnings

⚠️ Este cambio puede afectar APIs públicas
⚠️ Verificar compatibilidad con clientes downstream
⚠️ Tarea crítica - requiere atención inmediata
⚠️ Tarea de alta complejidad - considerar pair programming
