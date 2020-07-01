package com.leverx.jblog.util;

import com.leverx.jblog.model.Code;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public abstract class CodeUtils {

    public static final int CONFIRMATION_CODE_HOURS_TTL = 24;
    public static final int RESET_CODE_HOURS_TTL = 12;

    public static boolean checkConfirmationCodeRelevance(Code confirmationCode){
        return confirmationCode.getCreatedAt().isBefore(Instant.now().minus(CONFIRMATION_CODE_HOURS_TTL, ChronoUnit.HOURS));
    }

    public static boolean checkResetCodeRelevance(Code resetCode){
        return resetCode.getCreatedAt().isBefore(Instant.now().minus(RESET_CODE_HOURS_TTL, ChronoUnit.HOURS));
    }
}
