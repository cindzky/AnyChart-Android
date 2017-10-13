package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class HatchFills extends CoreBase {

    public HatchFills() {

    }

    protected HatchFills(String jsBase) {
        this.jsBase = jsBase;
    }

    protected HatchFills(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private HatchFill getItemAt;

    public HatchFill getItemAt() {
        if (getItemAt == null)
            getItemAt = new HatchFill(jsBase + ".itemAt()");

        return getItemAt;
    }

    private Double index;
    private HatchFillType type;
    private String type1;
    private String color;
    private Double thickness;
    private Double size;

    public HatchFills setItemAt(HatchFillType type, Double index, String color, Double thickness, Double size) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
            this.index = index;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.type = type;
            this.index = index;
            this.color = color;
            this.thickness = thickness;
            this.size = size;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemAt(%s, %f, %s, %f, %f)", (type != null) ? type.generateJs() : "null", index, color, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%s, %f, %s, %f, %f)", (type != null) ? type.generateJs() : "null", index, color, thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    public HatchFills setItemAt(String type1, Double index, String color, Double thickness, Double size) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.index = index;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.type1 = type1;
            this.index = index;
            this.color = color;
            this.thickness = thickness;
            this.size = size;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemAt(%s, %f, %s, %f, %f)", type1, index, color, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%s, %f, %s, %f, %f)", type1, index, color, thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index1;
    private PatternFill patternFill;

    public HatchFills setItemAt(Double index1, PatternFill patternFill) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.patternFill = patternFill;
        } else {
            this.index1 = index1;
            this.patternFill = patternFill;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemAt(%f, %s)", index1, (patternFill != null) ? patternFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%f, %s)", index1, (patternFill != null) ? patternFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index2;
    private HatchFill instance;

    public HatchFills setItemAt(Double index2, HatchFill instance) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
            this.instance = instance;
        } else {
            this.index2 = index2;
            this.instance = instance;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemAt(%f, %s)", index2, (instance != null) ? instance.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%f, %s)", index2, (instance != null) ? instance.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index3;
    private Boolean state;

    public HatchFills itemAt(Double index3, Boolean state) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
            this.state = state;
        } else {
            this.index3 = index3;
            this.state = state;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemAt(%f, %b)", index3, state));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%f, %b)", index3, state));
                js.setLength(0);
            }
        }
        return this;
    }

    private HatchFill[] items;
    private HatchFillType[] items1;
    private PatternFill[] items2;
    private HatchFill var_args;
    private HatchFillType var_args1;
    private PatternFill var_args2;

    public HatchFills setItems(HatchFill[] items, HatchFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args = var_args;
        } else {
            this.items = items;
            this.var_args = var_args;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public HatchFills setItems(HatchFill[] items, HatchFillType var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items = items;
            this.var_args1 = var_args1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), (var_args1 != null) ? var_args1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), (var_args1 != null) ? var_args1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public HatchFills setItems(HatchFill[] items, PatternFill var_args2) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args2 = var_args2;
        } else {
            this.items = items;
            this.var_args2 = var_args2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), (var_args2 != null) ? var_args2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), (var_args2 != null) ? var_args2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public HatchFills setItems(HatchFillType[] items1, HatchFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args = var_args;
        } else {
            this.items1 = items1;
            this.var_args = var_args;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public HatchFills setItems(HatchFillType[] items1, HatchFillType var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items1 = items1;
            this.var_args1 = var_args1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), (var_args1 != null) ? var_args1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), (var_args1 != null) ? var_args1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public HatchFills setItems(HatchFillType[] items1, PatternFill var_args2) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args2 = var_args2;
        } else {
            this.items1 = items1;
            this.var_args2 = var_args2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), (var_args2 != null) ? var_args2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), (var_args2 != null) ? var_args2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public HatchFills setItems(PatternFill[] items2, HatchFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args = var_args;
        } else {
            this.items2 = items2;
            this.var_args = var_args;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public HatchFills setItems(PatternFill[] items2, HatchFillType var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items2 = items2;
            this.var_args1 = var_args1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), (var_args1 != null) ? var_args1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), (var_args1 != null) ? var_args1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public HatchFills setItems(PatternFill[] items2, PatternFill var_args2) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args2 = var_args2;
        } else {
            this.items2 = items2;
            this.var_args2 = var_args2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), (var_args2 != null) ? var_args2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), (var_args2 != null) ? var_args2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetItemAt() {
        if (getItemAt != null) {
            return getItemAt.generateJs();
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", (type != null) ? type.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSsize() {
        if (size != null) {
            return String.format(Locale.US, "size: %f,", size);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSpatternFill() {
        if (patternFill != null) {
            return String.format(Locale.US, "patternFill: %s,", (patternFill != null) ? patternFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }

    private String generateJSinstance() {
        if (instance != null) {
            return String.format(Locale.US, "instance: %s,", (instance != null) ? instance.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex3() {
        if (index3 != null) {
            return String.format(Locale.US, "index: %f,", index3);
        }
        return "";
    }

    private String generateJSstate() {
        if (state != null) {
            return String.format(Locale.US, "state: %b,", state);
        }
        return "";
    }

    private String generateJSitems() {
        if (items != null) {
            return String.format(Locale.US, "items: %s,", arrayToString(items));
        }
        return "";
    }

    private String generateJSitems1() {
        if (items1 != null) {
            return String.format(Locale.US, "items: %s,", arrayToString(items1));
        }
        return "";
    }

    private String generateJSitems2() {
        if (items2 != null) {
            return String.format(Locale.US, "items: %s,", arrayToString(items2));
        }
        return "";
    }

    private String generateJSvar_args() {
        if (var_args != null) {
            return String.format(Locale.US, "var_args: %s,", (var_args != null) ? var_args.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvar_args1() {
        if (var_args1 != null) {
            return String.format(Locale.US, "var_args: %s,", (var_args1 != null) ? var_args1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvar_args2() {
        if (var_args2 != null) {
            return String.format(Locale.US, "var_args: %s,", (var_args2 != null) ? var_args2.generateJs() : "null");
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetItemAt());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSindex());
            js.append(generateJStype());
            js.append(generateJStype1());
            js.append(generateJScolor());
            js.append(generateJSthickness());
            js.append(generateJSsize());
            js.append(generateJSindex1());
            js.append(generateJSpatternFill());
            js.append(generateJSindex2());
            js.append(generateJSinstance());
            js.append(generateJSindex3());
            js.append(generateJSstate());
            js.append(generateJSitems());
            js.append(generateJSitems1());
            js.append(generateJSitems2());
            js.append(generateJSvar_args());
            js.append(generateJSvar_args1());
            js.append(generateJSvar_args2());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}