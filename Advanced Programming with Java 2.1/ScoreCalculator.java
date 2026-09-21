public class ScoreCalculator {
    public static void main(String[] args) {
        int correctAnswers = 8;
        int totalQuestions = 10;
        
        // Tính phần trăm: (số câu đúng / tổng số câu) * 100
        double percentage = ((double)correctAnswers / totalQuestions) * 100;
        
        System.out.println("Điểm của bạn là: " + percentage + " %");
        // Kết quả thực tế in ra: 
        // Điểm của bạn là: 0.0 %
    }
}