public class NotificacionEmail implements NotificableCampus {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[EMAIL CAMPUS]: " + mensaje);
    }
}