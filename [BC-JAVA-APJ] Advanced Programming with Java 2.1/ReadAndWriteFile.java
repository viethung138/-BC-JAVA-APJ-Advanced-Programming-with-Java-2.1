import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("numbers1.txt");

        if (numbers.isEmpty()) {
            System.out.println("Không có dữ liệu hợp lệ để tìm giá trị lớn nhất");
            return;
        }

        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
        System.out.println("Hoàn thành! Đã ghi giá trị lớn nhất (" + maxValue + ") vào file result.txt.");
    }

    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(filePath);
        
        if (!file.exists()) {
            System.err.println("Lỗi: File '" + filePath + "' không tồn tại.");
            return numbers;
        }
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                if(!line.trim().isEmpty()) {
                    numbers.add(Integer.parseInt(line.trim()));
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Lỗi: Nội dung file chứa dữ liệu không phải là số nguyên.");
        } catch (IOException e) {
            System.err.println("Lỗi trong quá trình đọc file " + e.getMessage());
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file " + e.getMessage());
        }
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
