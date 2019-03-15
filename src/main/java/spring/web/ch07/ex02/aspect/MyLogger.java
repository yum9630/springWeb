package spring.web.ch07.ex02.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogger {
	private Logger logger;
	
	public MyLogger(){
		logger = LogManager.getLogger(MyLogger.class);
	}
	
	
	@Around("@annotation(org.springframework.transaction.annotation.Transactional)")
	public Object advice(ProceedingJoinPoint jp) throws Throwable{
		logger.info(jp.toShortString()+"시작");
		Object obj = jp.proceed();
		logger.info(jp.toShortString()+"끝.");
		return obj;
	}
	
	@AfterThrowing(
		pointcut="@annotation(org.springframework.transaction.annotation.Transactional)"
		, throwing="e")
	public void advice2(JoinPoint jp, Throwable e){
		logger.error(jp.toShortString()+"에러:\n" + e);
	}
}
