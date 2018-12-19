package com.ankitshahit.ftpweb.core;

import org.springframework.util.StringUtils;

import java.util.List;
import java.util.function.Supplier;

public class Utils {
    /**
     * @param objects
     * @return
     */
    public static String newStringBuilder(Object... objects) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objects) {
            sb.append(obj);
        }
        return sb.toString();
    }

    public static <T> void executeOnlyWhenNotNull(T t, Supplier<T> whenNotNull) {
        if (isNullOrEmpty(t))
            return;
        whenNotNull.get();
    }

    public static boolean isNullOrEmpty(Object object) {
        return object == null || (object instanceof List ? isListEmpty((List) object)
                : object instanceof String && isStringEmpty(String.valueOf(object)));
    }

    public static boolean isListEmpty(List list) {
        return list == null || list.isEmpty();
    }

    public static boolean isStringEmpty(String string) {
        return StringUtils.isEmpty(string);
    }

    public static RuntimeException newRuntimeException(ExceptionType exceptionType, ErrorMessages errorMessages) {
        if (Utils.equalsIgnoreCase(ExceptionType.VALIDATION_EXCEPTION, exceptionType)) {
            return new ValidationException(errorMessages);
        } else if (Utils.equalsIgnoreCase(ExceptionType.OPERATION_EXCEPTION, exceptionType)) {
            return new OperationException(errorMessages);
        } else {
            return new RuntimeException(Utils.newStringBuilder(errorMessages));
        }
    }

    public static boolean equalsIgnoreCase(Enum<?> firstEnum, Enum<?> secondEnum) {
        if (firstEnum == null || secondEnum == null) {
            return false;
        }
        return (String.valueOf(firstEnum).equalsIgnoreCase(String.valueOf(secondEnum)));
    }
}
