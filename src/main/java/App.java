public class App {

    public static String ValidateCancellation(boolean refundStatus, String paymentStatus) {
        if ((refundStatus == true) || paymentStatus.equals("Not successful")) {
            return "Ticket Cancelled Successfully";
        } else {
            return "Ticket not cancelled, please activate refund!";
        }
    }

    public static String ValidateRefund(String ticketStatus, String paymentStatus) {
        if (ticketStatus.equals("Pending") && paymentStatus.equals("Successful")) {
            return "Refund Accepted";
        }

        if (ticketStatus.equals("Booked") && paymentStatus.equals("Successful")) {
            return "Refund Accepted";
        }

        if (ticketStatus.equals("Cancelled")) {
            return "Invalid Refund Request";
        }

        if (paymentStatus.equals("Not successful")) {
            return "Refund Rejected";
        }

        return null;
    }
}