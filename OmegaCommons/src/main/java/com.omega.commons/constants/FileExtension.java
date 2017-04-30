package com.omega.commons.constants;

/**
 * Created by chenzheng on 2014-06-29.
 * <p/>
 */
public enum FileExtension {
    EXCEL("EXCEL", ".xls"),
    PDF("PDF", ".pdf");

    private final String code;
    private final String extension;

    FileExtension(String code, String extension) {
        this.code = code;
        this.extension = extension;
    }

    public String getCode() {
        return code;
    }

    public String getExtension() {
        return extension;
    }

    public static FileExtension fromCode(String code) {
        for (FileExtension element : FileExtension.values()) {
            if (element.getCode().equals(code)) {
                return element;
            }
        }
        return null;
    }

    public String toString() {
        return extension;
    }

}
