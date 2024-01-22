class TextEditor{

	TextEditor(String textEditorName,String creator){
	
		System.out.println("Text Editor Name : "+textEditorName);
		System.out.println("Creator Name : "+creator);
	}
}
class PunchingCard{

	public static void main(String[] args){
	
		TextEditor atom = new TextEditor("Atom","Ben Halpern");
		TextEditor sublime = new TextEditor("Sublime","Jon Skinner");
		TextEditor vim = new TextEditor("VIM","Bram Moolenaar");
	}
}
