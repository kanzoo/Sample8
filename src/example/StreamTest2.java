package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Streamのサンプル
 * 
 * MEMO:Streamオブジェクトは再利用できない Streamのパイプライン処理を途中で停止する手段はない
 * 
 * @author apple
 *
 */
public class StreamTest2 {

	public static void main(String[] args) {

		// new StreamTest2().sample1();
		//new StreamTest2().sample2();
		new StreamTest2().sample4();
	}

	// Streamのサンプル（短縮でない）
	private void sample1() {

		List<String> list = Arrays.asList("abc", "def", "ghi", "ajkl");

		Stream<String> stream1 = list.stream();

		Stream<String> stream2 = stream1.filter(s -> s.contains("a"));

		Stream<String> stream3 = stream2.map(String::toUpperCase);

		stream3.forEach(System.out::println);

	}

	// Streamのサンプル（短縮）
	private void sample2() {

		List<String> list = Arrays.asList("abc", "def", "ghi", "ajkl");

		list.stream().filter(s -> s.contains("a")).map(String::toUpperCase)
				.forEach(System.out::println);

	}

	private void sample3() {

		Stream.Builder<String> builder = Stream.builder();
        builder.add("foo");
        builder.add("bar")
        .add("baz");
        
		// ストリーム生成
        Stream<String> stream = builder.build();
		
	}
	
	private void sample4(){
		
		List<String> list = Arrays.asList("ab","c","def");
		
		// 文字列連結
		String s = list.stream().collect(Collectors.joining(",", "[", "]"));
		
		// カウント処理
		list.stream().collect(Collectors.counting()); // =>3
		
		// 最小値の検索
		list.stream().collect(Collectors.minBy(String::compareTo)).ifPresent(System.out::println);
		
	}

}
