#include <iostream>
#include <string>

using namespace std;

class constructor{
	public:
	constructor(string z){
		//constructors are initially made to give variables
		//and initial value
		setName(z);
	}

		void setName(string x){
			name = x;
		}
		string getName(){
			return name;
		}
	private:
	string name;// this is a private string in the class

};

int constructors() {

	constructor obj("Major Stupid");
	cout<<obj.getName();

	return 0;
}

