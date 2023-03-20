package SeleniumConcepts;

public class CustomXpathConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//xpath is the address of an element. It is not an attribute
		//absolute xpath- complete path but risky-/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[2]
		//relative=
		
		//tag[@id = 'value' and text(), 'value');
		//tag[contains (text(), 'value')]
		//tag[starts-with(text(), 'value')]
		//tag[starts-with(@id= 'value']
		
		//find by position or index
		//(tag[@class = 'value'])[1]  --By index 
		//(tag[@class = 'value'])[position() =1] -- by position
		//(tag[@class = 'value'])[last()]  --goto last element
		//(tag[@class = 'value'])[last()-1]  --goto second last element
		
		//tag[@class = 'value']/../.. (move upwards. from child to parent to grandparent
		//tag[@class = 'value']/parent::tag otherway replacing ..
		//tag[@class = 'value']/ancestor::tag( to reach to grandparent replacing ..
		
		//tag[@class = 'value']/preceding-sibling::tagname (move to preceding sibling)
		
		//a[text(),'test'}/parent::td/preceding-sibling::td/[@input = 'checkbox)] //example from classic.freecrm.com
	}

}
