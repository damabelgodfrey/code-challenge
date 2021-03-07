<?php
// get minimum number of coin that can be flipped in an input of head and tail such that 2 head and 2 tail cannot preceed each other.
//e.g if A = $A =[1,1,0,1,1]; the output can be $output = [1,0,1,0,1]; flip = 3 coins or $output = [0,1,0,1,0]; flip = 2 coins
//final output should be 2
//e.g $A =[1,1]; =>1
//e.g $A =[1,0]; =>0

$arr1 =[1,1,0,1,1,1];
echo minCoinflip($arr1);
$arr2 =[1,1,0,1,1,1,0,1,1,0,0,0,1,1];
echo minCoinflip($arr2);

function minCoinflip($arr){
  $head = 1;
  $tail = 0;
  $count1 = 0;
  $count2 = 0;
  $size = count($arr);
  for ($j=0; $j < $size; $j++) {
    $currentCoin = $arr[$j];
    if($currentCoin == $head){
      $count1++;
      if($currentCoin ==1){
        $head =1;
      }else{
        $head =0;
      }
    }else{
      $head =$currentCoin;
    }

    if($currentCoin == $tail){
      $count2++;
      if($currentCoin ==1){
        $tail =1;
      }else{
        $tail =0;
      }
    }else{
      $tail =$currentCoin;
    }
   }
   return min($count1,$count2);
}