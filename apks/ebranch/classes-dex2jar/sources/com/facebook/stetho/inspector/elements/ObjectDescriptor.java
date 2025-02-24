package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/elements/ObjectDescriptor.class */
public final class ObjectDescriptor extends Descriptor<Object> {
    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void getAttributes(Object obj, AttributeAccumulator attributeAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void getChildren(Object obj, Accumulator<Object> accumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void getComputedStyles(Object obj, ComputedStyleAccumulator computedStyleAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final String getLocalName(Object obj) {
        return getNodeName(obj);
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final String getNodeName(Object obj) {
        return obj.getClass().getName();
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final NodeType getNodeType(Object obj) {
        return NodeType.ELEMENT_NODE;
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final String getNodeValue(Object obj) {
        return null;
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void getStyleRuleNames(Object obj, StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void getStyles(Object obj, String str, StyleAccumulator styleAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void hook(Object obj) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void setAttributesAsText(Object obj, String str) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void setStyle(Object obj, String str, String str2, String str3) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void unhook(Object obj) {
    }
}
