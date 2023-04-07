package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		String branch_name = "BranchS";

		Scanner sc = new Scanner(System.in);
		try {
		    System.out.print("점수를 입력하세요 (0~100점): ");
		    int score = sc.nextInt();
		    
		    if (score < 0 || score > 100) {
		        System.out.println(score + " 잘못된 점수입니다.");
		    } else {
		        char grade;
		        switch (score / 10) {
		            case 10:
		            case 9:
		                grade = 'A';
		                break;
		            case 8:
		                grade = 'B';
		                break;
		            case 7:
		                grade = 'C';
		                break;
		            case 6:
		                grade = 'D'; 
		                break;
		            default:
		                grade = 'F';
		        }
		        System.out.println("점수: " + score + " 학점: " + grade);
		    }
		} catch (InputMismatchException e) {
		    System.out.println("정수 값을 입력해주세요.");
		} finally {
		    sc.close();
		}
		
		System.out.println("Branch_Name = " + branch_name);
	}
}
