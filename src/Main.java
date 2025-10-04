import com.paymentapp.controller.PaymentController;
import com.paymentapp.model.Payment;
import com.paymentapp.dao.PaymentDAO;

public class Main {
    public static void main(String[] args) {
        PaymentController controller = new PaymentController();
        PaymentDAO dao = new PaymentDAO();

        Payment p1 = new Payment();
        p1.setUserId(1);
        p1.setAmount(100.00);
        p1.setCardNumber("1234-5678-9012-3456");

        System.out.println(controller.processPayment(p1));

        Payment p2 = new Payment();
        p2.setUserId(2);
        p2.setAmount(250.75);
        p2.setCardNumber("9876-5432-1098-7654");

        System.out.println(controller.processPayment(p2));

        System.out.println("\nAll Payments:");
        dao.getAllPayments().forEach(pay -> {
            System.out.println("User " + pay.getUserId() + " paid $" + pay.getAmount());
        });
    }
}
