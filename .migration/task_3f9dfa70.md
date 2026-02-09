# Migration Task: Sustituir usos de RestTemplate por WebClient (revisión y migración incremental)

**Task ID:** 3f9dfa70
**Type:** refactor
**Status:** Completed
**Timestamp:** 2026-02-09T11:21:01.908093

## Description

Detectar instancias de RestTemplate. Para cada caso, evaluar si migrar a WebClient (reactivo) es necesario y aplicar la migración en componentes críticos. Mantener adaptadores si se necesita coexistencia. Documentar cambios de comportamiento (timeouts, interceptors, error handling).

## Acceptance Criteria

- [x] Inventario de todas las instancias de RestTemplate y justificación por caso para migrar o mantener
- [x] Migración realizada para al menos las llamadas críticas identificadas y las pruebas asociadas pasan
- [x] Documentación con ejemplos de patrones equivalentes (sync -> WebClient.block() o adaptar con ExchangeStrategies) y cambios en manejo de errores

## Steps Executed

1. Crear branch para refactoring
2. Analizar código a refactorizar
3. Aplicar recipes de OpenRewrite si disponibles
4. Refactorizar código manualmente donde sea necesario
5. Asegurar que tests existentes pasan
6. Agregar tests si es necesario
7. Code review interno
8. Verificar criterios de aceptación: Inventario de todas las instancias de RestTemplate y justificación por caso para migrar o mantener, Migración realizada para al menos las llamadas críticas identificadas y las pruebas asociadas pasan
9. Commit y push

## OpenRewrite Recipes

- `org.openrewrite.java.migrate.MigrateRestTemplateToWebClient`

## Manual Steps Required

- Revisar cambios generados antes de commit
- Verificar que no hay regresiones funcionales

## Warnings

⚠️ Tarea crítica - requiere atención inmediata
⚠️ Tarea de alta complejidad - considerar pair programming
