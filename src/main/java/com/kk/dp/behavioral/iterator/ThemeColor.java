package com.kk.dp.behavioral.iterator;

public enum ThemeColor {
    WHITE,
    GREEN,
    BLACK,
    BLUE,
    ORANGE;

    public static Iterator<ThemeColor> getIterator() {
        return new ThemeColorIterator();
    }

    private static class ThemeColorIterator implements Iterator<ThemeColor> {
        private int position;

        private ThemeColorIterator() {
            this.position = 0;
        }

        @Override
        public boolean hasNext() {
            return this.position < ThemeColor.values().length;
        }

        @Override
        public ThemeColor next() {
            return ThemeColor.values()[position++];
        }
    }
}
