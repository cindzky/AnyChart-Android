package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class GanttRange extends VisualBase {

    private String jsBase;

    public GanttRange() {

    }

    protected GanttRange(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;

            js.append(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));
                js.setLength(0);
            }
        }
    }

    private Fill fill;

    public void setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;

            js.append(String.format(Locale.US, jsBase + ".fill(%s);", (fill != null) ? fill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s);", (fill != null) ? fill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color;
    private Double opacity;

    public void setFill(String color, Double opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f);", color, opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f);", color, opacity));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    public void setFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings;
    private Double from;
    private GanttDateTimeMarkers from1;
    private String from2;

    public void setFrom(Double from) {
        if (jsBase == null) {
            this.from = null;
            this.from1 = null;
            this.from2 = null;
            
            this.from = from;
        } else {
            this.from = from;

            js.append(String.format(Locale.US, jsBase + ".from(%f);", from));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".from(%f);", from));
                js.setLength(0);
            }
        }
    }


    public void setFrom(GanttDateTimeMarkers from1) {
        if (jsBase == null) {
            this.from = null;
            this.from1 = null;
            this.from2 = null;
            
            this.from1 = from1;
        } else {
            this.from1 = from1;

            js.append(String.format(Locale.US, jsBase + ".from(%s);", (from1 != null) ? from1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".from(%s);", (from1 != null) ? from1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setFrom(String from2) {
        if (jsBase == null) {
            this.from = null;
            this.from1 = null;
            this.from2 = null;
            
            this.from2 = from2;
        } else {
            this.from2 = from2;

            js.append(String.format(Locale.US, jsBase + ".from(%s);", from2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".from(%s);", from2));
                js.setLength(0);
            }
        }
    }

    private Layout layout;
    private String layout1;

    public void setLayout(Layout layout) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout = layout;
        } else {
            this.layout = layout;

            js.append(String.format(Locale.US, jsBase + ".layout(%s);", (layout != null) ? layout.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".layout(%s);", (layout != null) ? layout.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setLayout(String layout1) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout1 = layout1;
        } else {
            this.layout1 = layout1;

            js.append(String.format(Locale.US, jsBase + ".layout(%s);", layout1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".layout(%s);", layout1));
                js.setLength(0);
            }
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private PaperSize paperSizeOrOptions;
    private String paperSizeOrOptions1;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));
                js.setLength(0);
            }
        }
    }


    public void setPrint(String paperSizeOrOptions1, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private GanttDateTime getScale;

    public GanttDateTime getScale() {
        if (getScale == null)
            getScale = new GanttDateTime(jsBase + ".scale()");

        return getScale;
    }

    private GanttDateTime scale;

    public void setScale(GanttDateTime scale) {
        if (jsBase == null) {
            this.scale = scale;
        } else {
            this.scale = scale;

            js.append(String.format(Locale.US, jsBase + ".scale(%s);", (scale != null) ? scale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s);", (scale != null) ? scale.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double to;
    private GanttDateTimeMarkers to1;
    private String to2;

    public void setTo(Double to) {
        if (jsBase == null) {
            this.to = null;
            this.to1 = null;
            this.to2 = null;
            
            this.to = to;
        } else {
            this.to = to;

            js.append(String.format(Locale.US, jsBase + ".to(%f);", to));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".to(%f);", to));
                js.setLength(0);
            }
        }
    }


    public void setTo(GanttDateTimeMarkers to1) {
        if (jsBase == null) {
            this.to = null;
            this.to1 = null;
            this.to2 = null;
            
            this.to1 = to1;
        } else {
            this.to1 = to1;

            js.append(String.format(Locale.US, jsBase + ".to(%s);", (to1 != null) ? to1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".to(%s);", (to1 != null) ? to1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTo(String to2) {
        if (jsBase == null) {
            this.to = null;
            this.to1 = null;
            this.to2 = null;
            
            this.to2 = to2;
        } else {
            this.to2 = to2;

            js.append(String.format(Locale.US, jsBase + ".to(%s);", to2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".to(%s);", to2));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setUnlistenbykey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));
                js.setLength(0);
            }
        }
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        if (jsBase == null) {
            this.zIndex = zIndex;
        } else {
            this.zIndex = zIndex;

            js.append(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetScale() {
        if (getScale != null) {
            return getScale.generateJs();
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSfill() {
        if (fill != null) {
            return String.format(Locale.US, "fill: %s,", (fill != null) ? fill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
        }
        return "";
    }

    private String generateJSkeys() {
        if (keys != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys));
        }
        return "";
    }

    private String generateJSkeys1() {
        if (keys1 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys1));
        }
        return "";
    }

    private String generateJSangle() {
        if (angle != null) {
            return String.format(Locale.US, "angle: %f,", angle);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %b,", mode);
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", (mode1 != null) ? mode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode2() {
        if (mode2 != null) {
            return String.format(Locale.US, "mode: %s,", mode2);
        }
        return "";
    }

    private String generateJSopacity1() {
        if (opacity1 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity1);
        }
        return "";
    }

    private String generateJSkeys2() {
        if (keys2 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys2));
        }
        return "";
    }

    private String generateJSkeys3() {
        if (keys3 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys3));
        }
        return "";
    }

    private String generateJScx() {
        if (cx != null) {
            return String.format(Locale.US, "cx: %f,", cx);
        }
        return "";
    }

    private String generateJScy() {
        if (cy != null) {
            return String.format(Locale.US, "cy: %f,", cy);
        }
        return "";
    }

    private String generateJSmode3() {
        if (mode3 != null) {
            return String.format(Locale.US, "mode: %s,", (mode3 != null) ? mode3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity2() {
        if (opacity2 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity2);
        }
        return "";
    }

    private String generateJSfx() {
        if (fx != null) {
            return String.format(Locale.US, "fx: %f,", fx);
        }
        return "";
    }

    private String generateJSfy() {
        if (fy != null) {
            return String.format(Locale.US, "fy: %f,", fy);
        }
        return "";
    }

    private String generateJSimageSettings() {
        if (imageSettings != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings != null) ? imageSettings.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfrom() {
        if (from != null) {
            return String.format(Locale.US, "from: %f,", from);
        }
        return "";
    }

    private String generateJSfrom1() {
        if (from1 != null) {
            return String.format(Locale.US, "from: %s,", (from1 != null) ? from1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfrom2() {
        if (from2 != null) {
            return String.format(Locale.US, "from: %s,", from2);
        }
        return "";
    }

    private String generateJSlayout() {
        if (layout != null) {
            return String.format(Locale.US, "layout: %s,", (layout != null) ? layout.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlayout1() {
        if (layout1 != null) {
            return String.format(Locale.US, "layout: %s,", layout1);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions1() {
        if (paperSizeOrOptions1 != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", paperSizeOrOptions1);
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSscale() {
        if (scale != null) {
            return String.format(Locale.US, "scale: %s,", (scale != null) ? scale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSto() {
        if (to != null) {
            return String.format(Locale.US, "to: %f,", to);
        }
        return "";
    }

    private String generateJSto1() {
        if (to1 != null) {
            return String.format(Locale.US, "to: %s,", (to1 != null) ? to1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSto2() {
        if (to2 != null) {
            return String.format(Locale.US, "to: %s,", to2);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSenabled());
            js.append(generateJSfill());
            js.append(generateJScolor());
            js.append(generateJSopacity());
            js.append(generateJSkeys());
            js.append(generateJSkeys1());
            js.append(generateJSangle());
            js.append(generateJSmode());
            js.append(generateJSmode1());
            js.append(generateJSmode2());
            js.append(generateJSopacity1());
            js.append(generateJSkeys2());
            js.append(generateJSkeys3());
            js.append(generateJScx());
            js.append(generateJScy());
            js.append(generateJSmode3());
            js.append(generateJSopacity2());
            js.append(generateJSfx());
            js.append(generateJSfy());
            js.append(generateJSimageSettings());
            js.append(generateJSfrom());
            js.append(generateJSfrom1());
            js.append(generateJSfrom2());
            js.append(generateJSlayout());
            js.append(generateJSlayout1());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSscale());
            js.append(generateJSto());
            js.append(generateJSto1());
            js.append(generateJSto2());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgetScale());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}