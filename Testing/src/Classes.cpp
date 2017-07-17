#include <iostream>
using namespace std;

class NewClass{
	public:// This makes the class public, like public class in java
	void coolSaying(){
		cout<<"Awesome Possum"<<endl;
	}
};
int main() {

	NewClass obj1;
	obj1.coolSaying();
	return 0;
}
