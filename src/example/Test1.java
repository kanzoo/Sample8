package example;

import java.util.function.Consumer;

/**
 * ラムダ式とthis参照
 * @author apple
 *
 */
public class Test1 {
	
	private final String value;
	
	Test1(String value){
		this.value = value;
	}
	
	void exec() {
		
		// このラムダ式の中ではthis参照が使用でききる
		Consumer<String> proc = s -> System.out.println(s + ": " + this.value);
		// ラムダ式の本体実行
		proc.accept("showing");
		
	}

	public static void main(String[] args) {
		
		// このラムダ式の中ではthis参照を使えない
		//Consumer<String> proc = s -> System.out.println(s);
	
		Test1 my1 = new Test1("my1-value");
		my1.exec();
		Test1 my2 = new Test1("my2-value");
		my2.exec();
		
		
		
	}
	

	
	
	
}
