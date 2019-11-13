package homework_10.task_2;

import java.io.File;

// +
public enum RenameStrategy {
    LOWERCASE {
        @Override
        public String newFileName(File file) {
            String fileName = file.getName();
            fileName = fileName.toLowerCase();
            return fileName;
        }
    },
    UPPER_LOWER {
        @Override
        public String newFileName(File file) {
            String fileName = file.getName();
            fileName = fileName.substring(0, 1).toUpperCase() + fileName.substring(1).toLowerCase();
            return fileName;
        }
    },
    UPPERCASE {
        @Override
        public String newFileName(File file) {
            String fileName = file.getName();
            fileName = fileName.toUpperCase();
            return fileName;
        }
    };

    public abstract String newFileName(File file);

    public boolean renameFile(File file) {
        return file.renameTo(new File(file.getParentFile().getAbsolutePath() + "\\" + newFileName(file)));
    }
}
