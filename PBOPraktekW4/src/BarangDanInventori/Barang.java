package BarangDanInventori;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}
	
	public int getStok(){
		return this.stok;
	}
	
	public int AddStok(int penambah) {
		this.stok  += penambah;
		return this.stok;
	}
}
