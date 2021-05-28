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
		soft9Wearther2 k_10_soft9wearther2 = new soft9Wearther2(); //�޼ҵ� ����
		
		DocumentBuilder k_10_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); // �ľ��� ���� �غ�
		
		Document k_10_doc = k_10_docBuilder.parse(new File("C:\\Users\\���ѿ�\\Desktop\\weather.xml")); // xml������ ó�� pc�ȿ� �־ ��ü��θ� ����, xml�Ľ�ó�� Ȯ����

		Element k_10_root = k_10_doc.getDocumentElement(); // root �ױ׸� ������ ���⵵ ������ ������ ���̴� ���� ����
		NodeList k_10_tag_001 = k_10_doc.getElementsByTagName("data"); // xml data tag

		String k_10_seq = ""; //String k_10_seq ���� ""�� ����
		String k_10_hour = ""; //String k_10_hour ���� ""�� ����
		String k_10_day = "";  //String k_10_day ���� ""�� ����
		String k_10_temp = ""; //String k_10_temp ���� ""�� ����
		String k_10_tmx = "";  //String k_10_tmx ���� ""�� ����
		String k_10_tmn = "";  //String k_10_tmn ���� ""�� ����
		String k_10_sky = "";  //String k_10_sky ���� ""�� ����
		String k_10_pty = "";  //String k_10_pty ���� ""�� ����
		String k_10_wfKor = ""; //String k_10_wfKor ���� ""�� ����
		String k_10_wfEn = ""; //String k_10_wfEn ���� ""�� ����
		String k_10_pop = "";  //String k_10_pop ���� ""�� ����
		String k_10_r12 = "";  //String k_10_r12 ���� ""�� ����
		String k_10_s12 = "";  //String k_10_s12 ���� ""�� ����
		String k_10_ws = "";  //String k_10_wd ���� ""�� ����
		String k_10_wd = "";  //String k_10_wd ���� ""�� ����
		String k_10_wdKor = "";  //String k_10_wdKor ���� ""�� ����
		String k_10_wdEn = "";  //String k_10_wdEn ���� ""�� ����
		String k_10_reh = "";  //String k_10_reh ���� ""�� ����
		String k_10_r06 = "";  //String k_10_r06 ���� ""�� ����
		String k_10_s06 = "";  //String k_10_s06 ���� ""�� ����
		System.out.println("seq(��ȣ)  hour(�����ð�)      day    temp(����µ���)    tmx(�ְ�µ���)  "
				+ "tmn(�����µ���)    sky(�ϴû���)      pty(��������)    wfKor(����)     "
				+ "wfEn(Weather)    pop(����Ȯ��%)    r12(12�ð� ���� ������)    s12(12�ð� ���� ������)        "
				+ "ws(ǳ��(m/s)    wd(ǳ��)    wdKor(ǳ��)    wdEn(ǳ��)    "
				+ "reh(����%)    r06(6�ð� ���� ������)    s06(6�ð� ���� ������)");  // �̸� ����

		for (int k_10_i = 0; k_10_i < k_10_tag_001.getLength(); k_10_i++) { // k_10_tag_001�� ũ�⸸ŭ �ݺ��Ѵ�.
			Element k_10_elmt = (Element) k_10_tag_001.item(k_10_i); // ����� ���̴� ���� ����
			k_10_seq = k_10_tag_001.item(k_10_i).getAttributes().getNamedItem("seq").getNodeValue(); //k_10_tag_001�� data�� �ݺ�
			k_10_hour = k_10_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue(); // hour�� k_10_tag_001.getLength��ŭ �ݺ�
			k_10_day = k_10_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue(); //day�� k_10_tag_001.getLength��ŭ �ݺ�
			if (Integer.parseInt(k_10_day) == 0) { // k_10_day�� 0�̶��
				k_10_day = "����"; // ����
			} else if (Integer.parseInt(k_10_day) == 1) { // k_10_day�� 1�̶��
				k_10_day = "����"; // ����
			} else if (Integer.parseInt(k_10_day) == 2) { // k_10_day�� 2�̶��
				k_10_day = "��"; //��
			}
			k_10_temp = k_10_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue(); //temp�� k_10_tag_001.getLength��ŭ �ݺ�
			k_10_tmx = k_10_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue(); //tmx�� k_10_tag_001.getLength��ŭ �ݺ�
			k_10_tmn = k_10_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue(); //tmn�� k_10_tag_001.getLength��ŭ �ݺ� 
			k_10_sky = k_10_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue(); //sky�� k_10_tag_001.getLength��ŭ �ݺ�
			if (Integer.parseInt(k_10_sky) == 1) { //k_10_sky�� 1�̶��
				k_10_sky = "����"; // ����
			} else if (Integer.parseInt(k_10_sky) == 2) { //k_10_sky�� 2�̶��
				k_10_sky = "��������"; // ��������
			} else if (Integer.parseInt(k_10_sky) == 3) { //k_10_sky�� 3�̶��
				k_10_sky = "��������"; // ��������
			} else if (Integer.parseInt(k_10_sky) == 4) { //k_10_sky�� 4�̶��
				k_10_sky = "�帲"; // �帲
			}

			k_10_pty = k_10_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue(); //pty�� k_10_tag_001.getLength��ŭ �ݺ�
			if (Integer.parseInt(k_10_pty) == 0) { //k_10_pty�� 0�̶��
				k_10_pty = "����"; //����
			} else if (Integer.parseInt(k_10_pty) == 1) { //k_10_pty�� 1�̶��
				k_10_pty = "��"; //��
			} else if (Integer.parseInt(k_10_pty) == 2) { //k_10_pty�� 2�̶��
				k_10_pty = "��/��"; //��/��
			} else if (Integer.parseInt(k_10_pty) == 3) { //k_10_pty�� 3�̶��
				k_10_pty = "��/��"; //��/��
			} else if (Integer.parseInt(k_10_pty) == 4) { //k_10_pty�� 4�̶��
				k_10_pty = "��"; //��
			}
			k_10_wfKor = k_10_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue(); //wfKor�� k_10_tag_001.getLength��ŭ �ݺ�
			k_10_wfEn = k_10_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue(); //wfEn�� k_10_tag_001.getLength��ŭ �ݺ�
			k_10_pop = k_10_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue(); //pop�� k_10_tag_001.getLength��ŭ �ݺ�
			k_10_r12 = k_10_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue(); //r12�� k_10_tag_001.getLength��ŭ �ݺ�
			k_10_s12 = k_10_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue(); //s12�� k_10_tag_001.getLength��ŭ �ݺ�
			k_10_ws = k_10_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue(); //ws�� k_10_tag_001.getLength��ŭ �ݺ�
			k_10_wd = k_10_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue(); //wd�� k_10_tag_001.getLength��ŭ �ݺ�

			if (Integer.parseInt(k_10_wd) == 0) { //k_10_wd�� 0�̶��
				k_10_wd = "��  "; //��
			} else if (Integer.parseInt(k_10_wd) == 1) { //k_10_wd�� 1�̶��
				k_10_wd = "�ϵ�"; //�ϵ�
			} else if (Integer.parseInt(k_10_wd) == 2) { //k_10_wd�� 2�̶��
				k_10_wd = "��  "; //��
			} else if (Integer.parseInt(k_10_wd) == 3) { //k_10_wd�� 3�̶��
				k_10_wd = "����"; //����
			} else if (Integer.parseInt(k_10_wd) == 4) { //k_10_wd�� 4�̶��
				k_10_wd = "��  "; //��
			} else if (Integer.parseInt(k_10_wd) == 5) { //k_10_wd�� 5�̶��
				k_10_wd = "����"; //����
			} else if (Integer.parseInt(k_10_wd) == 6) { //k_10_wd�� 6�̶��
				k_10_wd = "��  "; //��
			} else if (Integer.parseInt(k_10_wd) == 7) { //k_10_wd�� 7�̶��
				k_10_wd = "�ϼ�"; //�ϼ�
			}
			k_10_wdKor = k_10_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue(); //wdKor�� k_10_tag_001.getLength��ŭ �ݺ�
			k_10_wdEn = k_10_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue(); //wdEn�� k_10_tag_001.getLength��ŭ �ݺ�
			k_10_reh = k_10_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue(); //reh�� k_10_tag_001.getLength��ŭ �ݺ�
			k_10_r06 = k_10_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue(); //r06�� k_10_tag_001.getLength��ŭ �ݺ�
			k_10_s06 = k_10_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue(); //s06�� k_10_tag_001.getLength��ŭ �ݺ�

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
					k_10_soft9wearther2.s06(k_10_s06)); //���ο� �޼ҵ带 ���� ���ڸ� ������ְ� ���ڼ��� �����ش�.
		}
	}
}
