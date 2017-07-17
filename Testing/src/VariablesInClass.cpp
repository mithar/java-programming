#include <iostream>
#include <string>

using namespace std;

class anotherClass{
	public:
		void setName(string x){
			name = x;
		}// this makes name which is private -  to x which is public
		string getName(){
			return name;// we need to return the variable to get the value of the private variable
			//now the class only has access to the variable while also making it public
		}
	private:
	string name;// this is a private string in the class

};

int main() {

	anotherClass obj1;
	obj1.setName("Mithar");
	cout<<obj1.getName();

	return 0;
}
