
public class stringsDemo {

	public static void main(String[] args) {
		String message = "the weather is very nice today";
		System.out.println(message);
		System.out.println("number of elements : "+message.length());
		System.out.println("5. element is "+message.charAt(4));
		System.out.println(message.concat("Hello"));
		/*System.out.println(message.startsWith("t"));
		System.out.println(message.endsWith("y"));
		char[] characters = new char[5];
		message.getChars(0, 4, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("he"));
		System.out.println(message.lastIndexOf("a"));*/
		
		String newMessage=message.replace(' ','-');
        System.out.println(newMessage);
        System.out.println(message.substring(2,5));

        for (String word : message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());

        System.out.println(message.trim());

	}

}
