import java.util.ArrayList;

public class MainEjercicio7 {
    public static void main(String[] args) {
        ArrayList<NotificableCampus> canales = new ArrayList<>();

        canales.add(new NotificacionEmail());
        canales.add(new NotificacionSms());
        canales.add(new AvisoPlataforma());

        System.out.println("--- Enviando Notificaciones de Exámenes ---");
        for (NotificableCampus canal : canales) {
            canal.enviarNotificacion("Mesa de examen programada para el 15 de Noviembre.");
        }
    }
}