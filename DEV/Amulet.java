public class Amulet{

private int cos_nieustalonego;
private String name;

public Amulet(int z){
	if(z==0)
		{
		cos_nieustalonego = 0;
		name = "Simple steel amulet of novice";
		}
}
public int rob_cos(){
	int res = cos_nieustalonego;
	return res;
}
}