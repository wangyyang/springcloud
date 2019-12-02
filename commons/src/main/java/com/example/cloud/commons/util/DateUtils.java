package com.example.cloud.commons.util;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateUtils extends org.apache.commons.lang3.time.DateUtils {

    public static int getAge(String dateString) {
        try {
            //String类型转为Date
            //注意String的格式要与simpleDateFormat设置的格式相同！
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date brithday = simpleDateFormat.parse(dateString);
            Calendar cal = Calendar.getInstance();
            if (cal.before(brithday)) { // 出生日期晚于当前时间，无法计算
                throw new IllegalArgumentException("The birthDay is before Now.It's unbelievable!");
            }
            int yearNow = cal.get(Calendar.YEAR); // 当前年份
            int monthNow = cal.get(Calendar.MONTH); // 当前月份
            int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH); // 当前日期
            cal.setTime(brithday);
            int yearBirth = cal.get(Calendar.YEAR);
            int monthBirth = cal.get(Calendar.MONTH);
            int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
            int age = yearNow - yearBirth; // 计算整岁数
            if (monthNow <= monthBirth) {
                if (monthNow == monthBirth) {
                    if (dayOfMonthNow < dayOfMonthBirth)
                        age--;// 当前日期在生日之前，年龄减一
                } else {
                    age--;// 当前月份在生日之前，年龄减一
                }
            }
            return age;
        } catch (Exception error) {
            return 0;
        }
    }

    /**
     * 计算start日期和end日期相差的天数(start - end, 可能为负数)
     */
    public static long getDayDiff(Date start, Date end) {
        Instant startInstant = start.toInstant();
        Instant endInstant = end.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate startLocalDate = startInstant.atZone(zoneId).toLocalDate();
        LocalDate endLocalDate = endInstant.atZone(zoneId).toLocalDate();
        return ChronoUnit.DAYS.between(startLocalDate, endLocalDate);
    }

    /**
     * 获取工作经验
     */
    public static int getWorkExp(String workTime) {
        try {
            Calendar now = Calendar.getInstance();
            now.setTime(new Date()); // 当前时间
            Calendar work = Calendar.getInstance();
            work.setTime(DateUtils.parseDate(workTime, "yyyy-MM-dd")); // 传入的时间
            if (work.after(now)) {
                return 0;
            } else {
                int year = now.get(Calendar.YEAR) - work.get(Calendar.YEAR);
                return year + 1;
            }
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * 根据年龄获取生日
     * @param age
     * @param elab
     * @return
     */
    public static String getBrithday(Integer age,Integer elab) {
        Calendar calendar = Calendar.getInstance();//获取现在时间
        String nowYear = String.valueOf(calendar.get(Calendar.YEAR));//获取年份
        Integer birth;
        if (elab == 0) {
            birth = Integer.parseInt(nowYear) - age;
        } else {
            birth = Integer.parseInt(nowYear) - (age - 1);
        }
        String birthDay = birth.toString() + "-" + (1+calendar.get(Calendar.MONTH)) + "-" + calendar.get(Calendar.DAY_OF_MONTH);
        return birthDay;
    }
}
