package book.chapter01.problme09

interface Expr

class Num(val value: Int): Expr

class Sum(val left: Expr, val right: Expr): Expr
