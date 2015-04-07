# Introduction #

A spring is an elastic object used to store mechanical energy. This simulation shows a <br>
single mass on a spring, which is connected to a wall.This is an example of a simple linear <br> oscillator.<br>
<br>
Please see demo below.<br>
<br>
<br>
<h1>Details</h1>
In physics, a spring can be seen as a device that stores potential energy, specifically<br>
elastic potential energy, by straining the bonds between the atoms of an elastic material.<br>
<br>
The performance of a spring is characterised by the relationship between the force (F) <br>
applied to it and the deflections (δ) from the unloaded free length. The F-δ characteristic <br>
is approximately linear provided the spring is close- coiled and the material elastic. The <br>
slope of the characteristic is known as the   stiffness of the spring   k = F/δ   <br>
( aka. spring 'constant', or 'rate', or 'scale' or 'gradient') and is determined by the spring <br>geometry and modulus of rigidity.<br>

In physics, damping is any effect that tends to reduce the amplitude of oscillations <br>
in an oscillatory system, particularly the harmonic oscillator.<br>

The simulation in this project follows the following definition :<br>
x = position of the block<br>
v = x' = velocity of the block<br>
m = mass of the block<br>
R = rest length of the spring<br>
k = spring stiffness<br>
b = damping constant (friction)<br>
A spring generates a force proportional to how far it is stretched (and acting in the<br> opposite direction to the stretch)<br><br>
<ul><li>Fspring = −k × stretch<br><br>
If we adjust the coordinate system so that x = 0 corresponds to the spring being<br> unstretched, then the stretch of the spring is simply equal to x. The spring force <br>
becomes<br><br>
</li><li>Fspring = − k x<br><br>
In addition, there is a damping (friction) force that resists the motion. It is<br> proportional to the velocity. So we add Fdamping = −b v to get the total force<br>
</li><li>F = Fspring + Fdamping + Fgravitation = − k x − b v + mg<br>
Combining this with Newton's law of motion F = m a, and the definition of <br>
acceleration as the second derivative of position a = x'' we have the differential<br> equation:<br><br>
</li><li>m x'' = −k x − b v + mg<br><br></li></ul>

or equivalently:<br><br>
<ul><li>x'' = − k⁄m x − b⁄m x' + g	(1)<br>
Equation (1) is the equation of motion for the spring, defining exactly what happens over time.</li></ul>

<b>Numerical Solution</b>

To solve this equation numerically (ie. by Blackberry) we use the Runge-Kutta method.<br> To do so we need to convert the second order differential equation (1) into a set of <br>
first order differential equations. Note that we can write the acceleration as the <br>
first derivative of velocity: x'' = v'. Therefore we can express equation (1) as <br>
a system of two first order differential equations:<br>
<ul><li>x' = v<br>
</li><li>v' = − k⁄m x − b⁄m v + g<br>
This is the form that we need in order to use the <i>Runge-Kutta</i> method for numerically<br> solving the differential equation.<br></li></ul>

To begin the simulation, we initialize the two variables x,v for their value at time<br>
t=0. Then we use the Runge-Kutta algorithm to calculate the values of x,v after <br>
a short time interval, and this continues indefinitely.<br>

The value of the damping ratio ζ determines the behavior of the system. A damped<br>
harmonic oscillator can be:<br>
<ul><li>Overdamped (ζ > 1):<br>
The system returns (exponentially decays) to equilibrium without oscillating. Larger<br> values of the damping ratio ζ return to equilibrium slower.<br>
</li><li>Critically damped (ζ = 1):<br>
The system returns to equilibrium as quickly as possible without oscillating. This is<br> often desired for the damping of systems such as doors.<br>
</li><li>Underdamped (0 < ζ < 1):<br>
The system oscillates (at reduced frequency compared to the undamped case) with the<br> amplitude gradually decreasing to zero.<br>
</li><li>Undamped (ζ = 0):<br>
The system oscillates at its natural resonant frequency (ωo).<br></li></ul>

<h1>Demo</h1>
<a href='http://www.youtube.com/watch?feature=player_embedded&v=hMg1i49hcZQ' target='_blank'><img src='http://img.youtube.com/vi/hMg1i49hcZQ/0.jpg' width='425' height=344 /></a><br><br><br>
<a href='http://www.youtube.com/watch?feature=player_embedded&v=ehVFdxTbX6s' target='_blank'><img src='http://img.youtube.com/vi/ehVFdxTbX6s/0.jpg' width='425' height=344 /></a>