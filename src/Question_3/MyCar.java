package Question_3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class MyCar implements ICar{
	public int f1(List<Car> t) {
		int sum = 0;
		for(Car car: t) {
			sum += car.getRate();
		}
		return sum/t.size();
	}
	public void f2(List<Car> t){
		int max = t.stream().mapToInt(v -> v.getRate()).max().orElseThrow(NoSuchElementException::new);
		int min = t.stream().mapToInt(v -> v.getRate()).min().orElseThrow(NoSuchElementException::new);
		for(Car car: t) {
			if(car.getRate()==max) {
				car.setRate(min);
				break;
			}
		}
		for(Car car: t) {
			if(car.getRate()==min) {
				car.setRate(max);
				break;
			}
		}
	}
	public void f3(List<Car> t){
		if(t.size()>0) {
			Collections.sort(t, new Comparator<Car>() {
			    @Override
			    public int compare(Car o1, Car o2) {
			        return o1.getMaker().compareTo(o2.getMaker())!=0?
			        		o1.getMaker().compareTo(o2.getMaker()):
			        		Integer.valueOf(o2.getRate()).compareTo(Integer.valueOf(o1.getRate()));
			    }
			});
		}
	}
}
