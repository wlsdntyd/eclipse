package chapter2;

import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {

        //      1���� ���ʴ�� ������ ���� �������� ��, 
        //      ���� N(1 <= N <= 10^9)�� �Է¹޾Ƽ� 
        //      1���� N���� ���� �ִܰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���. 
        //      (��, ��, ��, ��θ� ������ �� �ְ� �밢�����δ� ������ �� ����.)

        Scanner sc = new Scanner(System.in);

        int[][] arr;
        int size = 0;//ũ��
        int num = 1;//���ۼ�
        int x = 0;//x��
        int y = 0;//y��
        System.out.print("Ȧ���� �Է�: ");
        size = sc.nextInt();
        arr = new int[size][size];//����ڰ� ������ ������

        x = size/2;
        y = size/2;
        //���߾ӿ��� ����



        int a = 1;//��������
        int sum = 1;//���ٷ� ���ڸ� �����ϱ����� ����

        arr[y][x] = num;
        //���Ǳ��̿� ���� �����迭 ����
        outer : while(num <= size*size) {


            for(int i = 0; i < sum; i++) {
                if(a == 1){ x += 1; num++; 
                if(num == size*size+1) {
                    break outer;
                }//�԰ݿܷ� �Ѿ�� ���ڻ��� ���� 
                arr[y][x] = num; }//���������� ����
                if(a == 2){ y -= 1; num++; arr[y][x] = num; }//���� ����
            }//for

            for(int i = 0; i < sum; i++) {
                if(a == 3){ x -= 1; num++; arr[y][x] = num; }//�������λ���
                if(a == 4){ y += 1; num++; arr[y][x] = num; }//�Ʒ��� ����
            }//for


            if( a == 4 ) {
                a = 1;
                sum++;
            }else if( a == 2){
                sum++;
                a++;
            }else if( a==3 || a==1 ){
                a++;
            }//������� ����


        }//while

        //�迭 ��� �ڵ�
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"    ");
            }//inner
            System.out.println();
        }//output


        System.out.println("-------------------------------");



        int number = 0;
        System.out.println("5�� �����ϼ���");
        while(number != 5) {

            System.out.print("1���� �Ÿ��� ������ ���� ��: ");

            int n = sc.nextInt();
            int xLength;
            int yLength;

            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[i].length; j++) {   
                    if(n == arr[i][j]) {

                        if( i >= (size/2) ) {

                            yLength = i-(size/2);
                        }else{
                            yLength = (size/2)-i;
                        }//y�� �Ÿ�����

                        if( j >= (size/2) ) {
                            xLength = j-(size/2);
                        }else {
                            xLength = (size/2)-j;
                        }//x�� �Ÿ�����
                        System.out.println( xLength + yLength );
                    }//if

                }//inner

            }//outer
            number++;
        }//while



    }//main
}