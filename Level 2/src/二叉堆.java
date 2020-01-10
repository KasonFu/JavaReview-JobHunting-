import java.util.ArrayList;

//若把一个数组安排在一个完全二叉树中，假设一个根节点的index是i，那么他的左右子节点的index分别为2i+1，跟2i+2。
class BinaryHeap<Item extends Comparable>{
	ArrayList<Item> list = new ArrayList<Item>();
	public Item top() {
		return list.get(0);
	}
	//返回第一个数，将最后一个放到第一个数，并进行下潜
	public Item pop() {
		if(list.size()==0)return null;
		Item result = top();
		list.remove(0);
		if(list.size()>0)
		{
			list.add(0,list.get(list.size()-1));
			list.remove(list.size()-1);
			dive(0);
		}
		return result;
	}
	
	public void insert(Item a)
	{
		list.add(a);
		reorder(list.size()-1);
	}
	//从第k个开始下潜
	public void dive(int k)
	{
		while(2*k+1<=list.size()-1)
		{
			//左子节点
			int exchangechild = 2*k+1;
			if(exchangechild+1 <= list.size()-1&&cmp(exchangechild+1,exchangechild))
			{
				exchangechild++;
			}
			if(cmp(exchangechild,k))
			{
				exchange(k,exchangechild);
				k=exchangechild;
				continue;
			}
			else 
				break;
		}
	}
	
	public void reorder(int k)
	{
		while(k>0&&cmp(k,(k-1)/2))
		{
			exchange(k,(k-1)/2);
			k=(k-1)/2;
		}
	}
	
	public boolean cmp(int a, int b)
	{
		Item item1 = list.get(a);
		Item item2 = list.get(b);
		return item1.compareTo(item2)<0;
	}
	public void exchange(int a, int b)
	{
		Item temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);
	}
	public boolean isempty()
	{
		return list.size()==0;
	}
	//用二叉堆找出一组数列中前k项，当没满k时，往堆中加，满了就如果下个值比第一个（已存在最小值）大，就替换第一个
	public void printtopk(int k,Item[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			if(list.size()<k)
			{
				insert(array[i]);
			}
			else
			{
				if(array[i].compareTo(list.get(0))>0)
				{
					list.set(0, array[i]);
					dive(0);
				}
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}
}
public class 二叉堆 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryHeap<Integer> binaryHeap = new BinaryHeap<>();
        binaryHeap.insert(7);
        binaryHeap.insert(6);
        binaryHeap.insert(34);
        binaryHeap.insert(0);
        binaryHeap.insert(22);
        binaryHeap.insert(7);
        while(!binaryHeap.isempty()){
            System.out.println(binaryHeap.pop());
        }
//        binaryHeap.list = new ArrayList<Integer>();
//        Integer[] a = {2,5,6,7,9,10,5,6,4,23,44};
//        binaryHeap.printtopk(3,a);
        
        

    }
}


