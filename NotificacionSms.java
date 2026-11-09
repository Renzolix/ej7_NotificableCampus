public class NotificacionSms implements NotificableCampus {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[SMS URGENTE]: " + mensaje);
    }
}