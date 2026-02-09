# Migration Task: Inventario de código con APIs deprecadas

**Task ID:** 12c494ae
**Type:** manual
**Status:** Completed
**Timestamp:** 2026-02-09T11:18:06.920513

## Description

Analizar todo el repositorio para identificar usos de APIs y clases marcadas como deprecated (Spring Framework/Boot, Spring Security, RestTemplate, WebMvcConfigurerAdapter, javax.* imports, etc.). Generar un informe con ubicación, tipo de deprecación y riesgo.

## Acceptance Criteria

- [x] Listado exhaustivo (archivo o ticket) con todos los ficheros y líneas que usan APIs deprecadas
- [x] Clasificación por impacto (alta/media/baja) y recomendación de cambio para cada entrada
- [x] Confirmación de que el análisis cubre todos los módulos en branch main

## Steps Executed

1. Crear branch para cambios manuales
2. Analizar scope del cambio
3. Documentar plan de cambios
4. Implementar cambios paso a paso
5. Revisar cada cambio cuidadosamente
6. Ejecutar tests
7. Solicitar code review
8. Verificar criterios de aceptación: Listado exhaustivo (archivo o ticket) con todos los ficheros y líneas que usan APIs deprecadas, Clasificación por impacto (alta/media/baja) y recomendación de cambio para cada entrada
9. Commit y push

## Manual Steps Required

- Revisar cambios generados antes de commit
- Verificar que no hay regresiones funcionales
- Todos los cambios deben hacerse manualmente

## Warnings

⚠️ Tarea crítica - requiere atención inmediata
