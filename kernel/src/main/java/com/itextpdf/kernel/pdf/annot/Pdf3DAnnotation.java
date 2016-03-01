package com.itextpdf.kernel.pdf.annot;

import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.*;

public class Pdf3DAnnotation extends PdfAnnotation {

    public Pdf3DAnnotation(Rectangle rect, PdfObject artwork) {
        super(rect);
        put(PdfName._3DD, artwork);
    }

    public Pdf3DAnnotation(PdfDictionary pdfObject) {
        super(pdfObject);
    }

    @Override
    public PdfName getSubtype() {
        return PdfName._3D;
    }

    public Pdf3DAnnotation setDefaultInitialView(PdfObject initialView) {
        return put(PdfName._3DV, initialView);
    }

    public Pdf3DAnnotation setActivationDictionary(PdfDictionary activationDictionary) {
        return put(PdfName._3DA, activationDictionary);
    }

    public Pdf3DAnnotation setInteractive(boolean interactive) {
        return put(PdfName._3DI, new PdfBoolean(interactive));
    }

    public Pdf3DAnnotation setViewBox(Rectangle viewBox) {
        return put(PdfName._3DB, new PdfArray(viewBox));
    }
}