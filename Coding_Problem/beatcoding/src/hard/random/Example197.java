package hard.random;

import java.util.Random;

public class Example197 {
	/* 난수는 균일한 확률값을 가진 분포에 따라 범위 내의 수를 동일한 확률로 내보낸다.
	 * 하지만 시뮬레이션 같은 여러 프로그램에서는 여러 가지 분포에 따른 난수 발생이 필요하다.
	 * 표준정규분포의 난수 발생은 Random클래스에 존재하는 nextGaussian() 메소드를 활용하면 된다.
	 * 평균이 1/λ인 지수분포를 따르는 난수 발생은 다음 식을 활용한다.
	 * x = -log(u)/λ
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		double rNorm = rd.nextGaussian();
		
		double u = rd.nextDouble();
		double lambda = 5.0;
		double rExpo = -Math.log(u)/lambda;
		
		System.out.printf("%f %f", rNorm, rExpo);
	}
}
