package vo;

import java.util.Date;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Notice {
	private String seq;
	private String title;
	private String writer;
	private Date regdate;
	private String fileSrc1; //업로드할 파일명
	private String fileSrc2; //업로드할 파일명
	private int hit;
	private String content;
	
	public String getFileSrc1() {
		return fileSrc1;
	}
	public void setFileSrc1(String fileSrc1) {
		this.fileSrc1 = fileSrc1;
	}
	public String getFileSrc2() {
		return fileSrc2;
	}
	public void setFileSrc2(String fileSrc2) {
		this.fileSrc2 = fileSrc2;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	private List<CommonsMultipartFile> file;

	public List<CommonsMultipartFile> getFile() {
		return file;
	}
	public void setFile(List<CommonsMultipartFile> file) {
		this.file = file;
	}
	
	
}
