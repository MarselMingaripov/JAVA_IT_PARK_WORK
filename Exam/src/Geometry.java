
public abstract class Geometry implements Figure {
    static double trArea;
    static double trParametr;
    static double sqArea;
    static double sqParametr;
    static double parArea;
    static double parParametr;

    static double TriangleArea(double triangleheight, double triangledownline){
        trArea =((triangledownline * triangleheight) * 0.5);
        return trArea;
    }
    static double TriangleParametr(double triangleside1, double triangleside2, double triangledownline){
        trParametr = triangledownline + triangleside1 + triangleside2;
        return trParametr;
    }

    static double SquareArea(double squareline){
        sqArea = squareline * 2;
        return sqArea;
    }
    static double SquareParametr(double squareline){
        sqParametr = squareline * 4;
        return sqParametr;
    }

    static double ParalArea(double paralheight, double paralweight){
        parArea = paralheight * paralweight;
        return parArea;
    }
    static double ParalPerimetr(double paralheight, double paralweight){
        parParametr = ((paralheight + paralweight) * 2);
        return parParametr;
    }
}
