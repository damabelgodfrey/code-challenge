<?php
function hourGlass($A){
   for ($i=0; $i < 4 ; $i++) {
     for ($j=0; $j < 4 ; $j++) {
       $a = $A[$i][$j];
       $b = $A[$i][$j+1];
       $c = $A[$i][$j+2];

       $d = $A[$i+1][$j+1];

       $e = $A[$i+2][$j];
       $f = $A[$i+2][$j+1];
       $g = $A[$i+2][$j+2];
       $max = $a+$b+$c+$d+$e+$f+$g;
       if(!isset($finalMax)){
         $finalMax = $max;
       }
       if($max > $finalMax){
         $finalMax = $max;
       }
     }
   }
   return $finalMax;

}
