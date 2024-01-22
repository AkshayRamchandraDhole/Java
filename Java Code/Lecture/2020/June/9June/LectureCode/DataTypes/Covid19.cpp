#include<iostream>
class Covid19{

};
int main(){

	Covid19 c;
	//std::cout<<c; //error
	Covid19 *c1=new Covid19();
	std::cout<<c1; // address
}
