package AOP_Java_01;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;
/*
 계산기 프로그램 작성
 -주관심사 : 연산(ADD ,MUL)
 -보조관심(공통모듈) : 연산 작업에 걸린 시간을 확인
                    : log (console red 색상 출력)
                    > import org.apache.commons.logging.Log;
					> import org.apache.commons.logging.LogFactory;
  start time       start time
  ADD()            MUL()
  end time         end time
    
 
*/
public class Cal {
	public int Add(int x , int y){
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		
		sw.start();
		log.info("[타이머 시작]"); //console 에 출력
		
		int result = x + y;
		
		sw.stop();
		log.info("[타이머 시작]");
		log.info("[TIME LOG] Method : ADD");
		log.info("[TIME LOG] Process Time : " + sw.getTotalTimeMillis());
		
		return result;
	}
	public int Mul(int x , int y){
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		
		sw.start();
		log.info("[타이머 시작]"); //console 에 출력
		
		int result = x * y;
		
		sw.stop();
		log.info("[타이머 시작]");
		log.info("[TIME LOG] Method : MUL");
		log.info("[TIME LOG] Process Time : " + sw.getTotalTimeMillis());
		return result;
	}
}
