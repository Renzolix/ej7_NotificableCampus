# Ejercicio 7: NotificableCampus

## Explicación Lógica
1. **Colección Heterogénea:** Se agrupan instancias de `NotificacionEmail`, `NotificacionSms` y `AvisoPlataforma` dentro de un `ArrayList<NotificableCampus>`.
2. **Iteración Polimórfica:** El bucle `for-each` invoca el método `enviarNotificacion` ejecutando el comportamiento adaptado de cada canal de comunicación.