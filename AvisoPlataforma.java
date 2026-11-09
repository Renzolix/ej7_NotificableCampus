public class AvisoPlataforma implements NotificableCampus {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[NUEVO AVISO EN MOODLE]: " + mensaje);
    }
}