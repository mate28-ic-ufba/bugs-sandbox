<?php
function sum($a, $b){
  return $a + $b;
}
function sub($a, $b){
  return $a - $b;
}
function mul($a, $b){
  return $a * $b;
}
function div($a, $b){
  return $a / $b;
}

echo sum(10, 2) . "\n";
echo sub(0, 2) . "\n";
echo sub(2, 10) . "\n";
echo div(10, 2) . "\n";
echo div(10, 0) . "\n";
echo mul(10, 2) . "\n";
?>