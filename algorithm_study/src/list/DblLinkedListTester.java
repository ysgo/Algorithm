package list;

import java.util.Comparator;
import java.util.Scanner;

// 원형 이중 연결 리스트 클래스 DblLinkedList 사용 예
public class DblLinkedListTester {
	static Scanner stdIn = new Scanner(System.in);

	// 데이터(회원번호 + 이름)
	static class Data {
		static final int NO = 1; // 번호를 입력 받습니까?
		static final int NAME = 2; // 이름을 입력 받습니까?

		private Integer no; // 회원번호
		private String name; // 이름

		// 문자열을 반환
		public String toString() {
			return "(" + no + ") " + name;
		}

		// 데이터를 입력
		void scanData(String guide, int sw) {
			System.out.println(guide + "할 데이터를 입력하세요.");

			if ((sw & NO) == NO) {
				System.out.print("번호 : ");
				no = stdIn.nextInt();
			}
			if ((sw & NAME) == NAME) {
				System.out.print("이름 : ");
				name = stdIn.next();
			}
		}

		// 회원번호로 순서를 매기는 comparator
		public static final Comparator<Data> NO_ORDER = new NoOrderComparator();

		private static class NoOrderComparator implements Comparator<Data> {
			@Override
			public int compare(Data o1, Data o2) {
				return (o1.no > o2.no) ? 1 : (o1.no < o2.no) ? -1 : 0;
			}
		}

		// 이름으로 순서를 매기는 comparator
		public static final Comparator<Data> NAME_ORDER = new NameOrderComparator();

		private static class NameOrderComparator implements Comparator<Data> {
			@Override
			public int compare(Data o1, Data o2) {
				return o1.name.compareTo(o2.name);
			}
		}
	}

	// 메뉴 열겨형
	enum Menu {
		ADD_FIRST("머리에 노드를 삽입"),
		ADD_LAST("꼬리에 노드를 삽입"),
		ADD("선택 노드의 바로 뒤에 삽입"),
		RMV_FIRST("머리 노드를 삭제"),
		RMV_LAST("꼬리 노드를 삭제"),
		RMV_CRNT("선택 노드를 삭제"),
		CLEAR("모든 노드를 삭제"),
		SEARCH_NO("번호로 검색"),
		SEARCH_NAME("이름으로 검색"),
		NEXT("선택 노드를 뒤쪽으로"),
		PREV("선택 노드를 앞쪽으로"),
		PRINT_CRNT("선택 노드를 출력"),
		DUMP("모든 노드를 출력"),
		TERMINATE("종료");

		private final String message; // 출력할 문자열

		static Menu MenuAt(int idx) { // 서수가 idx인 열거를 반환
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) { // 생성자
			message = string;
		}

		String getMessage() { // 출력할 문자열을 반환
			return message;
		}
	}

	// 메뉴 선택
	static Menu selectMenu() {
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.TERMINATE.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = stdIn.nextInt();
		} while (key < Menu.ADD_FIRST.ordinal() || key > Menu.TERMINATE.ordinal());

		return Menu.MenuAt(key);
	}

	@SuppressWarnings("incomplete-switch")
	public static void main(String[] args) {
		Menu menu;					// 메뉴
		Data data;					// 추가용 데이터 참조
		Data ptr;					// 검색용 데이터 참조
		Data temp = new Data();		// 입력용 데이터
		
		DblLinkedList<Data> list = new DblLinkedList<>();	// 리스트를 생서
		
		do {
			switch(menu = selectMenu()) {
			
			case ADD_FIRST :
				data = new Data();
				data.scanData("머리에 삽입", Data.NO | Data.NAME);
				list.addFirst(data);
				break;
				
			case ADD_LAST :
				data = new Data();
				data.scanData("꼬리에 삽입", Data.NO | Data.NAME);
				list.addLast(data);
				break;
				
			case ADD :
				data = new Data();
				data.scanData("선택 노드의 바로 뒤에 삽입", Data.NO | Data.NAME);
				list.add(data);
				break;
				
			case RMV_FIRST :
				list.removeFirst();			// 머리 노드를 삭제
				break;
				
			case RMV_LAST :
				list.removeLast();			// 꼬리 노드를 삭제
				break;
				
			case RMV_CRNT :
				list.removeCurrentNode();	// 선택 노드를 삭제
				break;
				
			case SEARCH_NO :				// 회원 번호로 검색
				temp.scanData("검색", Data.NO);
				ptr = list.search(temp, Data.NO_ORDER);
				if(ptr == null)
					System.out.println("그 번호의 데이터가 없습니다.");
				else
					System.out.println("검색 성공 : " + ptr);
				break;
				
			case SEARCH_NAME :				// 이름으로 검색
				temp.scanData("검색", Data.NAME);
				ptr = list.search(temp, Data.NAME_ORDER);
				if(ptr == null)
					System.out.println("그 이름의 데이터가 없습니다.");
				else
					System.out.println("검색 성공 : " + ptr);
				break;
				
			case NEXT :						// 선택 노드를 뒤쪽으로 이동
				list.next();
				break;
				
			case PREV :
				list.prev();
				break;
				
			case PRINT_CRNT :
				list.printCurrentNode();	// 선택 노드의 데이터를 출력
				break;
				
			case DUMP :
				list.dump();				// 모든 노드를 리스트 순서로 출력
				break;
				
			case CLEAR : 
				list.clear();				// 모든 노드를 삭제
				break;
			}
		} while(menu != Menu.TERMINATE);
	}
}
