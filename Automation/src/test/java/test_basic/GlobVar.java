package test_basic;

public class GlobVar {
	static String lv = "local";
	static String gv;
	public void make_global() {
		gv = "global var";
		lv = "global";
	}
	public static void main(String[] args) {
		GlobVar gbb = new GlobVar();
		System.out.println(gbb.gv);
		System.out.println(gbb.lv);
		gbb.make_global();
		System.out.println(GlobVar.gv);
		System.out.println(GlobVar.lv);

	}

}
