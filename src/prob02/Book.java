package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode; // 대여여부 1이면 있고 0이면없다
	
	public Book(int bookNo,String title,String author){
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		stateCode=1;
	}
	public void rent(){
		System.out.println(title+"가 대여되었습니다.");
		stateCode=0;
	}
	public void print(){
		if(stateCode==1)
		System.out.println("책 제목:"+ title + ", 작가:"+author+", 대여유무:재고있음");
		else
		System.out.println("책 제목:"+ title + ", 작가:"+author+", 대여유무:재고없음");

	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
