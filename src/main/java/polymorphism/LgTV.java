package polymorphism;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;


@Component("tv")
public class LgTV implements TV {
	@Resource(name="apple")
	@Autowired
	@Qualifier("apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("====>LgTV 객체 생성");
	}
	
	
	
	public void powerOn() {
		System.out.println("Lg TV -------전원 켠다.");
	}
	
	public void powerOff() {
		System.out.println("Lg TV -------전원 끈다.");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeUp();
	}
}
