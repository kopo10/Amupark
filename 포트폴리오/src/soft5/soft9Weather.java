package soft5;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class soft9Weather {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		soft9Wearther2 k_10_soft9wearther2 = new soft9Wearther2(); //메소드 설정
		
		DocumentBuilder k_10_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); // 파씽을 위한 준비
		
		Document k_10_doc = k_10_docBuilder.parse(new File("C:\\Users\\류한열\\Desktop\\weather.xml")); // xml파일을 처리 pc안에 있어서 전체경로를 지정, xml파싱처리 확시작

		Element k_10_root = k_10_doc.getDocumentElement(); // root 테그를 가지고 오기도 하지만 지금은 쓰이는 곳이 없음
		NodeList k_10_tag_001 = k_10_doc.getElementsByTagName("data"); // xml data tag

		String k_10_seq = ""; //String k_10_seq 선언 ""로 정의
		String k_10_hour = ""; //String k_10_hour 선언 ""로 정의
		String k_10_day = "";  //String k_10_day 선언 ""로 정의
		String k_10_temp = ""; //String k_10_temp 선언 ""로 정의
		String k_10_tmx = "";  //String k_10_tmx 선언 ""로 정의
		String k_10_tmn = "";  //String k_10_tmn 선언 ""로 정의
		String k_10_sky = "";  //String k_10_sky 선언 ""로 정의
		String k_10_pty = "";  //String k_10_pty 선언 ""로 정의
		String k_10_wfKor = ""; //String k_10_wfKor 선언 ""로 정의
		String k_10_wfEn = ""; //String k_10_wfEn 선언 ""로 정의
		String k_10_pop = "";  //String k_10_pop 선언 ""로 정의
		String k_10_r12 = "";  //String k_10_r12 선언 ""로 정의
		String k_10_s12 = "";  //String k_10_s12 선언 ""로 정의
		String k_10_ws = "";  //String k_10_wd 선언 ""로 정의
		String k_10_wd = "";  //String k_10_wd 선언 ""로 정의
		String k_10_wdKor = "";  //String k_10_wdKor 선언 ""로 정의
		String k_10_wdEn = "";  //String k_10_wdEn 선언 ""로 정의
		String k_10_reh = "";  //String k_10_reh 선언 ""로 정의
		String k_10_r06 = "";  //String k_10_r06 선언 ""로 정의
		String k_10_s06 = "";  //String k_10_s06 선언 ""로 정의
		System.out.println("seq(번호)  hour(단위시간)      day    temp(현재온도℃)    tmx(최고온도℃)  "
				+ "tmn(최저온도℃)    sky(하늘상태)      pty(강수상태)    wfKor(날씨)     "
				+ "wfEn(Weather)    pop(강수확률%)    r12(12시간 예상 강수량)    s12(12시간 예상 적설량)        "
				+ "ws(풍속(m/s)    wd(풍향)    wdKor(풍향)    wdEn(풍향)    "
				+ "reh(습도%)    r06(6시간 예상 강수량)    s06(6시간 예상 적설량)");  // 이름 설정

		for (int k_10_i = 0; k_10_i < k_10_tag_001.getLength(); k_10_i++) { // k_10_tag_001의 크기만큼 반복한다.
			Element k_10_elmt = (Element) k_10_tag_001.item(k_10_i); // 현재는 쓰이는 곳이 없음
			k_10_seq = k_10_tag_001.item(k_10_i).getAttributes().getNamedItem("seq").getNodeValue(); //k_10_tag_001의 data를 반복
			k_10_hour = k_10_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue(); // hour을 k_10_tag_001.getLength만큼 반복
			k_10_day = k_10_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue(); //day을 k_10_tag_001.getLength만큼 반복
			if (Integer.parseInt(k_10_day) == 0) { // k_10_day가 0이라면
				k_10_day = "오늘"; // 오늘
			} else if (Integer.parseInt(k_10_day) == 1) { // k_10_day가 1이라면
				k_10_day = "내일"; // 내일
			} else if (Integer.parseInt(k_10_day) == 2) { // k_10_day가 2이라면
				k_10_day = "모레"; //모레
			}
			k_10_temp = k_10_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue(); //temp을 k_10_tag_001.getLength만큼 반복
			k_10_tmx = k_10_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue(); //tmx을 k_10_tag_001.getLength만큼 반복
			k_10_tmn = k_10_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue(); //tmn을 k_10_tag_001.getLength만큼 반복 
			k_10_sky = k_10_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue(); //sky을 k_10_tag_001.getLength만큼 반복
			if (Integer.parseInt(k_10_sky) == 1) { //k_10_sky가 1이라면
				k_10_sky = "맑음"; // 맑음
			} else if (Integer.parseInt(k_10_sky) == 2) { //k_10_sky가 2이라면
				k_10_sky = "구름조금"; // 구름조금
			} else if (Integer.parseInt(k_10_sky) == 3) { //k_10_sky가 3이라면
				k_10_sky = "구름많음"; // 구름많음
			} else if (Integer.parseInt(k_10_sky) == 4) { //k_10_sky가 4이라면
				k_10_sky = "흐림"; // 흐림
			}

			k_10_pty = k_10_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue(); //pty을 k_10_tag_001.getLength만큼 반복
			if (Integer.parseInt(k_10_pty) == 0) { //k_10_pty가 0이라면
				k_10_pty = "없음"; //없음
			} else if (Integer.parseInt(k_10_pty) == 1) { //k_10_pty가 1이라면
				k_10_pty = "비"; //비
			} else if (Integer.parseInt(k_10_pty) == 2) { //k_10_pty가 2이라면
				k_10_pty = "비/눈"; //비/눈
			} else if (Integer.parseInt(k_10_pty) == 3) { //k_10_pty가 3이라면
				k_10_pty = "눈/비"; //눈/비
			} else if (Integer.parseInt(k_10_pty) == 4) { //k_10_pty가 4이라면
				k_10_pty = "눈"; //눈
			}
			k_10_wfKor = k_10_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue(); //wfKor을 k_10_tag_001.getLength만큼 반복
			k_10_wfEn = k_10_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue(); //wfEn을 k_10_tag_001.getLength만큼 반복
			k_10_pop = k_10_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue(); //pop을 k_10_tag_001.getLength만큼 반복
			k_10_r12 = k_10_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue(); //r12을 k_10_tag_001.getLength만큼 반복
			k_10_s12 = k_10_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue(); //s12을 k_10_tag_001.getLength만큼 반복
			k_10_ws = k_10_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue(); //ws을 k_10_tag_001.getLength만큼 반복
			k_10_wd = k_10_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue(); //wd을 k_10_tag_001.getLength만큼 반복

			if (Integer.parseInt(k_10_wd) == 0) { //k_10_wd가 0이라면
				k_10_wd = "북  "; //북
			} else if (Integer.parseInt(k_10_wd) == 1) { //k_10_wd가 1이라면
				k_10_wd = "북동"; //북동
			} else if (Integer.parseInt(k_10_wd) == 2) { //k_10_wd가 2이라면
				k_10_wd = "동  "; //동
			} else if (Integer.parseInt(k_10_wd) == 3) { //k_10_wd가 3이라면
				k_10_wd = "남동"; //남동
			} else if (Integer.parseInt(k_10_wd) == 4) { //k_10_wd가 4이라면
				k_10_wd = "남  "; //남
			} else if (Integer.parseInt(k_10_wd) == 5) { //k_10_wd가 5이라면
				k_10_wd = "남서"; //남서
			} else if (Integer.parseInt(k_10_wd) == 6) { //k_10_wd가 6이라면
				k_10_wd = "서  "; //서
			} else if (Integer.parseInt(k_10_wd) == 7) { //k_10_wd가 7이라면
				k_10_wd = "북서"; //북서
			}
			k_10_wdKor = k_10_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue(); //wdKor을 k_10_tag_001.getLength만큼 반복
			k_10_wdEn = k_10_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue(); //wdEn을 k_10_tag_001.getLength만큼 반복
			k_10_reh = k_10_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue(); //reh을 k_10_tag_001.getLength만큼 반복
			k_10_r06 = k_10_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue(); //r06을 k_10_tag_001.getLength만큼 반복
			k_10_s06 = k_10_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue(); //s06을 k_10_tag_001.getLength만큼 반복

			System.out.printf("  %s %11s %11s %12s %18s %14s"
					+ "           %s             %s       %s %15s %10s%% %18s%28s%25.4sm/s        %2s          %s     %7s%15s%%%20s%28s\n",
					k_10_soft9wearther2.seq(k_10_seq), k_10_soft9wearther2.hour(k_10_hour),
					k_10_soft9wearther2.day(k_10_day), k_10_soft9wearther2.temp(k_10_temp),
					k_10_soft9wearther2.tmx(k_10_tmx), k_10_soft9wearther2.tmn(k_10_tmn),
					k_10_soft9wearther2.sky(k_10_sky), k_10_soft9wearther2.pty(k_10_pty),
					k_10_soft9wearther2.wfKor(k_10_wfKor), k_10_soft9wearther2.wfEn(k_10_wfEn),
					k_10_soft9wearther2.pop(k_10_pop), k_10_soft9wearther2.r12(k_10_r12),
					k_10_soft9wearther2.s12(k_10_s12), k_10_soft9wearther2.ws(k_10_ws), k_10_soft9wearther2.wd(k_10_wd),
					k_10_soft9wearther2.wdKor(k_10_wdKor), k_10_soft9wearther2.wdEn(k_10_wdEn),
					k_10_soft9wearther2.reh(k_10_reh), k_10_soft9wearther2.r06(k_10_r06),
					k_10_soft9wearther2.s06(k_10_s06)); //새로운 메소드를 만들어서 글자를 계산해주고 글자수를 맞춰준다.
		}
	}
}
