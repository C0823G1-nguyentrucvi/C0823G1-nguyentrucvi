package on_tap_1.view;

import on_tap_1.controller.LecturersController;
import on_tap_1.controller.PupilController;
import on_tap_1.model.Lecturers;
import on_tap_1.model.Pupil;
import ss10_Java_Collection_Framework.model.Product;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PupilView {
    private final Scanner scanner = new Scanner(System.in);
    private final PupilController pupilController = new PupilController();
    private final LecturersController lecturersController = new LecturersController();

    public void menu() {
        int choice;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ HỌC VIÊN--");
            System.out.println("Chọn chức năng theo số (để tiep tuc).");
            System.out.println("1.thêm mới giảng viên hoặc học viên");
            System.out.println("2. Xóa giảng viên hoặc học viên");
            System.out.println("3.Xem danh sách giảng viên hoặc học viên.");
            System.out.println("4.Thoát.");
            choice = scanner.nextInt();
            switch (choice) {
                case 3:
                    System.out.println("mời chọn ");
                    System.out.println("1.xem giảng viên  ");
                    System.out.println("2.xem học  viên ");
                    choice = scanner.nextInt();
                    if (choice == 1) {
                        showListLecturers();
                        break;
                    } else if (choice == 2) {
                        showListPupil();
                        break;

                    }
                    break;
                case 1:
                    System.out.println("mời chọn ");
                    System.out.println("1.thêm giảng viên  ");
                    System.out.println("2.thêm học  viên ");
                    choice = scanner.nextInt();
                    if (choice == 1) {
                        createLecturers();
                        System.out.println("thêm mới giảng viên thành công.");
                        break;
                    } else if (choice == 2) {
                        createPu();
                        System.out.println("thêm mới học viên thành công.");
                        break;

                    }
                    break;
                case 2:
                    System.out.println("mời chọn ");
                    System.out.println("1.xóa giảng viên  ");
                    System.out.println("2.xóa học  viên ");
                    choice = scanner.nextInt();
                    if (choice == 1) {
                        removeLec();
                        break;
                    } else if (choice == 2) {
                        removePu();
                        break;

                    }

                    break;
            }

        } while (true);
    }

    private void removePu() {
        System.out.println("nhap id bạn muốn xóa??");
        Integer id = scanner.nextInt();
        Pupil remove = pupilController.findById(id);
        if (remove == null) {
            System.out.println("không tìm thấy ");

        } else {
            System.out.println(" thông tin sản phẩm cần xóa" + "  " + remove);
            System.out.println("bạn có muốn xóa? y/n:");
            String confirm = scanner.next();
            do {
                switch (confirm) {
                    case "y":
                        lecturersController.removelec(id);
                        System.out.println("xóa thành công");
                        return;
                    case "n":
                        return;

                    default:
                        System.out.println("nhập sai rồi nhập lại");
                        confirm = scanner.nextLine();
                }

            } while (true);
        }
    }

    private void removeLec() {
        System.out.println("nhap id bạn muốn xóa??");
        Integer id = scanner.nextInt();
        Lecturers remove = LecturersController.findById(id);
        if (remove == null) {
            System.out.println("không tìm thấy ");

        } else {
            System.out.println(" thông tin sản phẩm cần xóa" + "  " + remove);
            System.out.println("bạn có muốn xóa? y/n:");
            String confirm = scanner.next();
            do {
                switch (confirm) {
                    case "y":
                        lecturersController.removelec(id);
                        System.out.println("xóa thành công");
                        return;
                    case "n":

                        return;

                    default:
                        System.out.println("nhập sai rồi nhập lại");
                        confirm = scanner.nextLine();
                }

            } while (true);
        }
    }

    private void createPu() {
        Pupil pupil = InputPu();
        pupilController.addPu(pupil);
    }

    private Pupil InputPu() {
        System.out.println("nhập id");
        Integer id = scanner.nextInt();
        System.out.println("nhập mã");
        String code = scanner.next();
        System.out.println("nhập tên");
        String name = scanner.next();
        System.out.println("Nhập ngày (định dạng yyyy-MM-dd):");
        LocalDate date = LocalDate.parse(scanner.next());
        System.out.println("nhập lớp");
        String clazz = scanner.next();
        System.out.println("nhập điểm");
        double point = Double.parseDouble(scanner.next());
        return new Pupil(id, code, name, date, clazz, point);
    }

    private void createLecturers() {
        Lecturers lecturers = InputLec();
        LecturersController.addLec(lecturers);

    }

    private Lecturers InputLec() {
        System.out.println("nhập id");
        Integer id = Integer.valueOf(scanner.next());
        System.out.println("nhập mã");
        String code = scanner.next();
        System.out.println("nhập tên");
        String name = scanner.next();
        System.out.println("Nhập ngày (định dạng yyyy-MM-dd):");
        LocalDate date = LocalDate.parse(scanner.next());
        System.out.println("nhập true/false để chọn giới tính.");
        System.out.println("true (nữ)");
        System.out.println("false (name)");
        boolean gender = Boolean.parseBoolean(scanner.next());
        System.out.println("nhập chuyên môn");
        String specialize = scanner.next();
        return new Lecturers(id, code, name, date, gender, specialize);
    }

    private void showListLecturers() {
        List<Lecturers> Lecturers = lecturersController.getAllLecturers();
        System.out.println(Lecturers);
    }

    private void showListPupil() {
        List<Pupil> pupils = pupilController.getAllPupil();
        System.out.println(pupils);
    }


}
