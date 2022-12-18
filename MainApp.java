package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.format("a = ");
		int a = sc.nextInt();
		System.out.format("b = ");
		int b = sc.nextInt();
		System.out.format("n = ");
		int n = sc.nextInt();
		
		int tongsonguyen = tongSoNguyen(n);
		int dientich = dienTichHCN(a,b);
		int tongsole = tongSoLe(n); 
		int tongsochan = tongSoChan(n); 
		int giaithua = tinhGiaiThua(n);
		int tong = tongHaiSo(a,b);
		int hieu = hieuHaiSo(a,b);
		System.out.println("hieu = "+hieu);
		System.out.println("tong = "+ tong);
		System.out.println("Giai thua cua " + n + " la: "+ giaithua );
		System.out.println("tong cac so chan la: "+ tongsochan );
		System.out.println("tong cac so le la: "+ tongsole );
		System.out.println("dien tich hinh chu nhat la : "+ dientich + " don vi" );
		System.out.println("tong cac so nguyen la : "+ tongsonguyen );
                
	}

	private static int tongSoNguyen(int n) {
		// TODO Auto-generated method stub
		int tongsonguyen = 0;
        for (int i = 0; i < n; i ++) {
        	tongsonguyen += i;
        }

        return tongsonguyen;
    }

	private static int dienTichHCN(int a,int b) {
		// TODO Auto-generated method stub
		int dientich = a * b;
		return dientich;	
	}

	private static int tongSoLe(int n) {
		// TODO Auto-generated method stub
		int tongsole = 0;
		 for (int i = 0; i <= n; i++) {
	            if (i % 2 != 0) {
	            	tongsole += i;
	            }
	    }
		return tongsole;
	}
	private static int tongSoChan(int n) {
		// TODO Auto-generated method stub
		int tongsochan = 0;
        for (int i = 0; i <= n; i +=2) {
        	tongsochan += i;
        }

        return tongsochan;
    }

	private static int tinhGiaiThua(int n) {
		// TODO Auto-generated method stub
		if (n > 0) {
            return n * tinhGiaiThua(n - 1);
        } else {
            return 1;
        }
    }
	

	public static int tongHaiSo(int a, int b) {
		// TODO Auto-generated method stub
		int tong = a + b;
		return tong;
	}

	public static int hieuHaiSo(int a, int b) {
		// TODO Auto-generated method stub
		int hieu = a - b ;
		return hieu;
	}

}
