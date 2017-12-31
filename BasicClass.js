function Class(className, catNumber){
	this.name = className
	this.catNum = catNum
}


Class.prototype.calcFGrade = function(){
	this.fGrade = 0
	for (int i = 0; i < catNum; i++)
		fGrade += catGrades[i]*(catWeights[i]/100)
	return fGrade
}